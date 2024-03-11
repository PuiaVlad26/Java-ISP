package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.List;
import java.io.IOException;

public class WaypointFileUtils {
    public void writeWaypoint(Waypoint waypoint, File routeDir) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new FileWriter(new File(routeDir, waypoint.getName() + ".json")), waypoint);

    }

    public static boolean searchPoint(String name, String routedir) {
        try {
            File[] points = new File(routedir).listFiles(File::isDirectory);
            for (int i = 0; i < points.length; i++) {
                if (points[i].getName().equals(new String(name))) {
                    //System.out.println(points.get(i).getName()+" == "+name);
                    return true;
                }
            }
        } catch (Exception ex) {ex.printStackTrace();
        }
        return false;
    }

    public static List<Waypoint> getWaypoint(File routeDir) throws IOException {
        List<Waypoint> waypoints = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        File[] waypointFiles = routeDir.listFiles();
        for (File wayp : waypointFiles) {
            Waypoint waypoint = objectMapper.readValue(wayp, Waypoint.class);
            waypoints.add(waypoint);
        }
        return waypoints;
    }


}
