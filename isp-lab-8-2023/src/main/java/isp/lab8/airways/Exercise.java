package isp.lab8.airways;

import examples.files.FilesAndFoldersUtil;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Exercise {
    private static String ROUTS_DIR = "routs/";

    public void addwp() {
        Scanner scanner = new Scanner(System.in);
        String name_route;

        System.out.println("===========Creating route===========");
        System.out.print("Enter the route name: ");
        name_route = scanner.nextLine();
        FilesAndFoldersUtil.createFolder("routs/" + name_route);


        //2. create wayponit
        //~menu asks input waypoint atribute
        Waypoint waypoint = new Waypoint();
        System.out.println("Add waypoint");
        System.out.print("Name: ");
        waypoint.setName(scanner.nextLine());
        System.out.print("Latitudine: ");
        waypoint.setLatitude(scanner.nextDouble());
        System.out.print("Longitudine: ");
        waypoint.setLongitude(scanner.nextDouble());
        System.out.print("Altitudine: ");
        waypoint.setAltitude(scanner.nextInt());
        System.out.println();
        //WaypointFileUtils.
    }

    public File[] listRoutes() {
        System.out.println("Available routes");
        File[] routes = new File(ROUTS_DIR).listFiles(File::isDirectory);
        for (int i = 0; i < routes.length; i++) {
            System.out.println(routes[i].getName());
        }
        return routes;
    }

    public void deleteRoutes() {
        //4. delete route
        //~menu asks for routs folder(ex: LRCL-LROP)~delete it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the route name to delete");
        String routeToDelete = scanner.nextLine();
        if(!WaypointFileUtils.searchPoint(routeToDelete, ROUTS_DIR))
        {
            System.out.println("The waypoint doesn't exist");
            return;
        }

        File ftodelete = new File(ROUTS_DIR + routeToDelete);
        ftodelete.delete();
    }

    public void calcDist() {
        Scanner scanner = new Scanner(System.in);
        String point1, point2;

        System.out.println("First point:");
        point1 = scanner.nextLine();
        System.out.println("Second point:");
        point2 = scanner.nextLine();
        System.out.println(point1);
        System.out.println(point2);


        //~3. calculate route distace
        //~menu asks the route
        //~load all the files from the routs folder memory
        //~calculate distace beetwen each consecutive points LRCL-TASOD-SOPOV
       /* System.out.println("Add waypoint");
        System.out.println("Name");
        waypoint.setName(scanner.nextLine());
        System.out.println("Latitudine");
        waypoint.setLatitude(scanner.nextDouble());
        System.out.println("Longitudine");
        waypoint.setLongitude(scanner.nextDouble());
        System.out.println("Altitudine");
        waypoint.setAltitude(scanner.nextInt());
      */
        System.out.println("Distance" + WaypointDistanceCalculator.calculateDistance(46.7852, 23.6862, 47.0548, 23.9212));
    }

    public static void main(String[] args) {

        Exercise ex = new Exercise();
        Scanner sc = new Scanner(System.in);

        String cmd;
        String help = "help, exit, list, add, delete, distance";

        System.out.println(help);
        while (true) {
            System.out.print("command>");
            cmd = sc.nextLine();
            switch (cmd) {
                case "exit":
                    System.exit(0);
                    break;
                case "list":
                    ex.listRoutes();
                    break;
                case "add":
                    ex.addwp();
                    break;
                case "delete":
                    ex.deleteRoutes();
                    break;
                case "distance":
                    ex.calcDist();
                    break;
                case "help":
                    System.out.println(help);
                    break;
                case "test":
                {
                    System.out.println(WaypointFileUtils.searchPoint("alb", ROUTS_DIR));}
                    break;
                default:
                    System.out.println("Pa");
                    break;
            }
        }


    }
    // Java program for the haversine formula


    static double haversine(double lat1, double lon1,
                            double lat2, double lon2) {
        // distance between latitudes and longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        // convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return rad * c;
    }
}
