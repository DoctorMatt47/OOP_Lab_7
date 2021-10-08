package OOP_Lab_7.program.domain.entity.socket;

public class ElectricOutlet implements ISocket{
    private IConnectable connectable;
    private boolean isPlugged = false;

    @Override
    public void plug(IConnectable connectable) {
        this.connectable = connectable;
        isPlugged = true;
    }

    @Override
    public void pull() {
        this.connectable = null;
        isPlugged = false;
    }

    @Override
    public boolean isPlugged() {
        return isPlugged;
    }
}
