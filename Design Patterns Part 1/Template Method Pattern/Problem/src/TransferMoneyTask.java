public class TransferMoneyTask {
    private AuditTrail auditTrail;

    public TransferMoneyTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        AuditTrail auditTrail = new AuditTrail();
        System.out.println("Transfer Money");
    }
}
