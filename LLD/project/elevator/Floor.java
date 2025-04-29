package guru.springframework.spring5webapp.designpattern.LLD.project.elevator;

public class Floor {
    int floorId;
    ExternalDispatcher externalDispatcher;

    public Floor(int floorId){
        this.floorId=floorId;
        externalDispatcher=new ExternalDispatcher();
    }
    public void pressButton(Direction direction){
        externalDispatcher.submitExternalRequest(floorId,direction);
    }
}
