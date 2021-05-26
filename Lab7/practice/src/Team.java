import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team  {
    
    ArrayList<Player> team;
    ArrayList<Player> selectTeam;


    public ArrayList<Player> getAllPlayers(){
        team = new ArrayList<>();
        team.add(new Player("Marc Andreter Stergen", 1, Position.GK));
        team.add(new Player("Sergino Dest", 2, Position.DF));
        team.add(new Player("Gerand Pique", 3, Position.DF));
        team.add(new Player("Ronald Araujo", 4, Position.DF));
        team.add(new Player("Sergio Busquets", 5, Position.MF));
        team.add(new Player("Carles Alena", 6, Position.MF));
        team.add(new Player("Antoine Griezmann", 7, Position.FW));
        team.add(new Player("Miralem Pjanic", 8, Position.MF));
        team.add(new Player("Martin Braithwaite", 9, Position.FW));
        team.add(new Player("Lionel Messi", 10, Position.FW));
        team.add(new Player("Osumane Dembele", 11, Position.FW));
        team.add(new Player("Riqui Puig", 12, Position.MF));
        team.add(new Player("Neto", 13, Position.GK));
        team.add(new Player("Philippe Coutinho", 14, Position.MF));
        team.add(new Player("Clement Lenglet", 15, Position.DF));
        team.add(new Player("Pedri", 16, Position.MF));
        team.add(new Player("Francisco Trincao", 17, Position.FW));
        team.add(new Player("Jordi Alba", 18, Position.DF));
        team.add(new Player("Matheus Fernandes", 19, Position.MF));
        team.add(new Player("Seigi Roberto", 20, Position.DF));
        team.add(new Player("Frenkie De Jong", 21, Position.MF));
        team.add(new Player("Ansu Fati", 22, Position.FW));
        return team;
    }

    public ArrayList<Player> getSelectTeam(){
        int countGK = 0, countDF = 0, countMF = 0, countFW = 0; 
        selectTeam = new ArrayList<>();
        Random general = new Random();
        System.out.println("list players: ");
        while (countGK < 1) {
            int rdGK = general.nextInt(22);
            if (team.get(rdGK).getPosition().equals(Position.GK)) {
                selectTeam.add(team.get(rdGK));
                countGK++;
            }
        }
        while (countDF < 4) {
            int rdDF = general.nextInt(22);
            if (team.get(rdDF).getPosition().equals(Position.DF)) {
                selectTeam.add(team.get(rdDF));
                countDF++;
            }
        }
        while (countMF < 4) {
            int rdMF = general.nextInt(22);
            if (team.get(rdMF).getPosition().equals(Position.MF)){
                selectTeam.add(team.get(rdMF));
                countMF++;
            }
        }
        while (countFW < 2) {
            int rdFW = general.nextInt(22);
            if (team.get(rdFW).getPosition().equals(Position.FW)) {
                selectTeam.add(team.get(rdFW));
                countFW++;
            }
        }
        return team;
    }
        // public ArrayList<Player> buildTeam(int defender, int midfielder, int forwarder){
        // int countGK = 0, countDF = 0, countMF = 0, countFW = 0; 
        // selectTeam = new ArrayList<>();
        // Random general = new Random();
        // System.out.println("Team Formation: : ");

    // }

    

}
