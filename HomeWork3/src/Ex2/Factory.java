package Ex2;

public class Factory {
    Samsung samsung;
    Iphone iphone;

    public Factory(Samsung samsung, Iphone iphone) {
        this.samsung = samsung;
        this.iphone = iphone;
    }

    OperationSystem operationSystem1 = new OperationSystem("Android");
    OperationSystem operationSystem2 = new OperationSystem("Ios");
    Board board1 = new Board("j-108", "размер 10х12х13");
    Board board2 = new Board("7uik", "размер 15х12х13");
    Camera camera1 = new Camera("Samsung", "15x zoom", false);
    Camera camera2 = new Camera("iphone", "20x zoom", true);


    public void assembly (Samsung samsung){
        System.out.println(samsung.model + " " + operationSystem1.getOperationSystem() + " " + board1.getType() + " " + board1.getSize() + " "
                + " " + camera1.getType() + " " + camera1.getZoom() + " " + camera1.isHaveFlash());

    }

    public void assembly (Iphone iphone){
        System.out.println(iphone.model + " " + operationSystem2.getOperationSystem() + " " + board2.getType() + " " + board2.getSize() + " "
                + " " + camera2.getType() + " " + camera2.getZoom() + " " + camera2.isHaveFlash());

    }



}
