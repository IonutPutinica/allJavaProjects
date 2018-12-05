public interface Lane
{
 void enterFromTheLeft(); // allowed, when no cars from the right are on the lane
 void exitToTheRight(); // a car has left the lane to the right
 void enterFromTheRight(); // allowed, when no cars from the left are on the lane
 void exitToTheLeft(); // a car has left the lane to the left
}