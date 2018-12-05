
public class Notebook
{
   private int numberOfNotes;
   private Note[] notes;

   public Notebook(int maxNumberOfNotes)
   {
      notes = new Note[maxNumberOfNotes];
      numberOfNotes = 0;
   }

   public int getNumberOfNotes()
   {
      return numberOfNotes;
   }

   public Note getNote(int index)
   {
      return notes[index];
   }

   public String getMessage(int index)
   {
      return notes[index].toString();
   }

   public void addNote(Note note)
   {
      notes[numberOfNotes] = note.copy();
      numberOfNotes++;

   }

   public void addNote(String message)
   {
      notes[numberOfNotes] = new Note(message);
      numberOfNotes++;
   }7

   public void addHighPriorityNote(String message)
   {
      Note tempNote = new Note(message);
      tempNote.setToHighPriority();
      notes[numberOfNotes] = tempNote;
      numberOfNotes++;
   }

   public void removeNote(int index)
   {
      for (int i = index; i < numberOfNotes; i++)
      {
         notes[i] = notes[i + 1];
      }
      notes[numberOfNotes] = null;
      numberOfNotes--;
   }

   public Note[] getAllNotes()
   {
      Note[] returnArray = new Note[numberOfNotes];
      for (int i = 0; i < numberOfNotes; i++)
      {
         returnArray[i] = notes[i].copy;
      }
      return returnArray;
   }

   public int getNumberOfHighPriorityNotes()
   {
      int numberOfHighPriorityNotes = 0;
      for (int i = 0; i < numberOfNotes; i++)
      {
         if (notes[i].isHighPriority())
         {
            numberOfHighPriorityNotes++;
         }
      }
      return numberOfHighPriorityNotes;
   }

   public Note[] getAllHighPriorityNotes()
   {
Note[] returnArray=new Note[getNumberOfHighPriorityNotes()];
int indexInReturnArray=0;
for(int=0;i<numberOfNotes;i++)
{
   if(notes[i].isHighPriority())
   {
      returnArray[indexInReturnArray]=notes[i].copy;
      indexInReturnArray++;
   }
}
   }
}
