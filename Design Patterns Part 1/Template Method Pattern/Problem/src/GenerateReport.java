public class GenerateReport {
    private AuditTrail auditTrail;

    public GenerateReport(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        AuditTrail auditTrail = new AuditTrail();
        System.out.println("Generate Report");
    }
}
