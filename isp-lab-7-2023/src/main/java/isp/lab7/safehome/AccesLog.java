package isp.lab7.safehome;
public class AccesLog {
   private String tenantName;
   private LocalDateTime dataTime;
   private String operation;
   private DoorStatus doorStatus;
   private String errorMessage;
   private List<AccesLog> accesLogList = new ArrayList<>();

    public AccesLog(java.lang.String tenantName, LocalDateTime dataTime, java.lang.String operation, DoorStatus doorStatus, java.lang.String errorMessage) {
        this.tenantName = tenantName;
        this.dataTime = dataTime;
        this.operation = operation;
        this.doorStatus = doorStatus;
        this.errorMessage = errorMessage;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "AccesLog{" +
                "tenantName=" + tenantName +
                ", dataTime=" + dataTime +
                ", operation=" + operation +
                ", doorStatus=" + doorStatus +
                ", errorMessage=" + errorMessage +
                ", accesLogList=" + accesLogList +
                '}';
   }

}
