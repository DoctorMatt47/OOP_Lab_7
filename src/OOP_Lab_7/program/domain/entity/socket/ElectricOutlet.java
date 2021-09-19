package OOP_Lab_7.program.domain.entity.socket;

public class ElectricOutlet implements ISocket{
    public IConnectable connectable;

    @Override
    public void plug(IConnectable connectable) {
        this.connectable = connectable;
    }

    @Override
    public void pull() {
        this.connectable = null;
    }
}
