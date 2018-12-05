public interface PublicToilet
{
   // wait if there are no available cabins or if it is not your turn
   void stepIntoCabin(Person person);

   void leaveCabin();

   // wait if there are no available faucets or if it is not your turn
   void startWashingHands(Person person);

   void stopWashingHands();

   // wait if there are no available hand dryers or if it is not your turn
   void startDryingHands(Person person);

   void stopDryingHands();
}
