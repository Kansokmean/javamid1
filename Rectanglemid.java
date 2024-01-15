 //package JavaProject;

    public class Rectangle {

        private double width;
        private double length;

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public double getLength() {
            return length;
        }

        public double getArea() {
            return width * length;
        }

        public double getPerimeter() {
            return 2 * (width + length);
        }
    }


