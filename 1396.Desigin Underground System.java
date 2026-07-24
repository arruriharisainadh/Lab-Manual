lass UndergroundSystem {


    private static class CheckInInfo {
        String stationName;
        int checkInTime;

        CheckInInfo(String stationName, int checkInTime) {
            this.stationName = stationName;
            this.checkInTime = checkInTime;
        }
    }

  
    private static class RouteData {
        double totalTime = 0;
        int count = 0;

        void addTrip(int travelTime) {
            totalTime += travelTime;
            count++;
        }

        double getAverage() {
            return totalTime / count;
        }
    }


    private Map<Integer, CheckInInfo> checkInMap;

    private Map<String, RouteData> routeMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        routeMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckInInfo(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
  
        CheckInInfo info = checkInMap.remove(id);
        
        String routeKey = info.stationName + "->" + stationName;
        int travelTime = t - info.checkInTime;

        routeMap.putIfAbsent(routeKey, new RouteData());
        routeMap.get(routeKey).addTrip(travelTime);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String routeKey = startStation + "->" + endStation;
        return routeMap.get(routeKey).getAverage();
    }
}
