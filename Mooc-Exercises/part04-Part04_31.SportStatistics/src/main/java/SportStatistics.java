
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team:");
        String teamSearched = scan.nextLine();
        int games = 0;
        int wins = 0; 
        int losses = 0;
        
        
        try(Scanner teams = new Scanner(Paths.get(file))){             
            
            while(teams.hasNextLine()){ 
                String team = teams.nextLine();

                String[] data = team.split(",");

        
                String homeTeamName = data[0];
                String awayTeamName = data[1];

                int homeTeamPoints = Integer.valueOf(data[2]);
                int awayTeamPoints = Integer.valueOf(data[3]);

                if(homeTeamName.contentEquals(teamSearched)){
                    games++;
                    if(homeTeamPoints > awayTeamPoints){
                        wins++;
                    }else{ 
                        losses++;
                    }
                }
                if(awayTeamName.contentEquals(teamSearched)){
                    games++;
                    if(homeTeamPoints < awayTeamPoints){
                        wins++;
                    }else{ 
                        losses++;
                    }
                }                
            }
        } catch (Exception e){ 
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);


    }

   

}
