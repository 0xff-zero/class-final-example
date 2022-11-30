package fit.ome;

public class RealSrv implements IService{
    @Override
    public String realName() {
        return "this is real service";
    }

    public int cal(){
        return 1+2;
    }
}
