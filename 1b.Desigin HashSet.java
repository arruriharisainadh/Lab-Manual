import java.util.*;

class UndergroundSystem {
    private Map<Integer, CheckInData> checkInMap;
    private Map<String, RouteData> travelMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        travelMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckInData(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckInData checkInData = checkInMap.get(id);
        String startStation = checkInData.station;
        int startTime = checkInData.time;

        String route = startStation + "->" + stationName;
        int travelTime = t - startTime;

        RouteData routeData = travelMap.getOrDefault(route, new RouteData());
        routeData.totalTime += travelTime;
        routeData.count++;
        travelMap.put(route, routeData);
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;
        RouteData routeData = travelMap.get(route);
        return routeData.totalTime / routeData.count;
    }
}

class CheckInData {
    String station;
    int
