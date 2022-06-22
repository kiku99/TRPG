public class Character {

    public static Character character;

    public enum Jobs{
        KNIGHT("기사"),
        THIEF("도적"),
        MONK("수도승"),
        ARCHER("궁수")
        ;

        private final String label;
        Jobs(String label) {
            this.label = label;
        }

        public String label(){
            return label;
        }
    }

    public enum Race{
        OAK("오크"),
        HUMAN("인간"),
        ELF("엘프"),
        DWARF("드워프")
        ;

        private final String label;
        Race(String label) {
            this.label = label;
        }

        public String label(){
            return label;
        }
    }

public void createCharacter(){

}

public Jobs selectJobs(){

}

public Race selectRace(){

}
}
