#include <iostream>

struct Point {
    int x, y;
};

struct Rectangle {
    Point bottomLeft;
    Point topRight;
};

bool doRectanglesOverlap(Rectangle A, Rectangle B) {
    // Check if one rectangle is to the left of the other
    if (A.topRight.x < B.bottomLeft.x || B.topRight.x < A.bottomLeft.x) {
        return false;
    }

    // Check if one rectangle is above the other
    if (A.topRight.y < B.bottomLeft.y || B.topRight.y < A.bottomLeft.y) {
        return false;
    }

    // If neither of the above conditions is true, the rectangles overlap
    return true;
}

int main() {
    Rectangle A = {{0, 0}, {2, 2}};
    Rectangle B = {{1, 1}, {3, 3}};
    
    if (doRectanglesOverlap(A, B)) {
        std::cout << "Rectangles overlap" << std::endl;
    } else {
        std::cout << "Rectangles do not overlap" << std::endl;
    }

    return 0;
}
