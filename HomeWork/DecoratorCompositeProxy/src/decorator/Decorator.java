package decorator;

public abstract class Decorator extends ResultViewer{

    public ResultViewer r;

    public Decorator(ResultViewer r) {
        this.r = r;
    }
}
