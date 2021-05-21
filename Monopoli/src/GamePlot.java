public class GamePlot {
	
	protected static final int GAME_PLOT_LENGHT = 20;

	public static Object[] GamePlot = new String[GAME_PLOT_LENGHT];	
	public static Object[] GamePlotMirror = new String[GAME_PLOT_LENGHT];
			
	public static void renderGamePlot() {			
		for(int i = 0 ; i <= 7 ; i++) {
			System.out.print(GamePlot[i]);			
		}	
		System.out.print("\n" + GamePlot[19]);
		System.out.print("                  ");
		System.out.print(GamePlot[8]);		
		System.out.print("\n" + GamePlot[18]);
		System.out.print("                  ");
		System.out.print(GamePlot[9] + "\n");		
		for(int j = 17 ; j > 9 ; j--) {
			if(j == 10) {
				System.out.println(GamePlot[j]);
			}else {
				System.out.print(GamePlot[j]);	
			}				
		}		
	}
			
}
