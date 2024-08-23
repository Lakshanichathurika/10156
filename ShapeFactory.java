public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "SQUARE":
                return new Square();
                case "CIRCLE":
                    return new Circle();
                    case "RECTANGLE":
                        return new Rectangle();
                        default:
                            return null;
        }
    }
}
