public class Task3 {
    static class Shape{
        protected float width;
        protected float height;
        public Shape(float x, float y){
            width = x;
            height = y;
        }
        public float calculateArea(){
        }
    }
    static class Circle extends Shape{
        public Circle(float x, float y){
            super(x, y);
        }
    }
}
