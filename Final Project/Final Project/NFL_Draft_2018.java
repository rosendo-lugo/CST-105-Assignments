package NFL_Draft;

	
	import javafx.application.Application;
	import javafx.collections.ObservableList;
	import javafx.geometry.Insets;
	import javafx.geometry.Pos;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.ListView;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.VBox;
	import javafx.scene.text.FontWeight;
	import javafx.stage.Stage;

	public class NFL_Draft_2018  extends Application {
	  
		@SuppressWarnings("unchecked")
		@Override
	    public void start(Stage primaryStage) {

	        PlayerManager playerManager = new PlayerManager();
	        playerManager.createPlayers();

	        @SuppressWarnings("rawtypes")
			ListView<String> draftedPlayers = new ListView();
	        ListView<String> blackListedPlayers = new ListView();
	        ListView<String> statsListView = new ListView();
	        ListView<String> availableLIST_OF_PLAYERS = new ListView();

	        for (String playerName : playerManager.playerNames) {
	            availableLIST_OF_PLAYERS.getItems().add(playerName);
	        }

	        ObservableList index1 = availableLIST_OF_PLAYERS.getSelectionModel().getSelectedIndices();	
	        
	        Button stats = new Button();
	        stats.setText("VIEW STATS");
	        stats.setOnAction(e -> {
	            if (!statsListView.getItems().isEmpty()) {
	                statsListView.getItems().remove(0);
	            }
	            statsListView.getItems().add(playerManager.availableLIST_OF_PLAYERS.get(indexToInt(index1)).toString());
	        });
	        Button draft = new Button();
	        draft.setText("DRAFT");
	        draft.setOnAction(e -> {
	            if (!statsListView.getItems().isEmpty()) {
	                statsListView.getItems().remove(0);
	            }
	            draftedPlayers.getItems().add(availableLIST_OF_PLAYERS.getSelectionModel().getSelectedItem());
	            availableLIST_OF_PLAYERS.getItems().remove(availableLIST_OF_PLAYERS.getSelectionModel().getSelectedItem());
	            playerManager.availableLIST_OF_PLAYERS.remove(availableLIST_OF_PLAYERS.getSelectionModel().getSelectedIndex());
	        });

	        Button blackList = new Button();
	        blackList.setText("BLACKLIST");
	        blackList.setOnAction(e -> {
	            if (!statsListView.getItems().isEmpty()) {
	                statsListView.getItems().remove(0);
	            }
	            blackListedPlayers.getItems().add(availableLIST_OF_PLAYERS.getSelectionModel().getSelectedItem());
	            availableLIST_OF_PLAYERS.getItems().remove(availableLIST_OF_PLAYERS.getSelectionModel().getSelectedItem());
	            playerManager.availableLIST_OF_PLAYERS.remove(availableLIST_OF_PLAYERS.getSelectionModel().getSelectedIndex());

	        });

	        
	        Button quit = new Button();
	        quit.setText("QUIT");
	        quit.setOnAction(e -> primaryStage.close());

	        Label statsLabel = new Label("Player Stats");
	        statsLabel.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));
	        Label blackListedLabel = new Label("Black Listed Players");
	        blackListedLabel.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));
	        Label drafted = new Label("Drafted Players");
	        drafted.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));
	        Label available = new Label("List of Players");
	        available.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));


	        BorderPane root = new BorderPane();
	        root.setPadding(new Insets(10, 10, 10, 10));

	        VBox left = new VBox(20);        
	        left.getChildren().addAll(available, availableLIST_OF_PLAYERS);

	        BorderPane center = new BorderPane();

	        VBox centerLeft = new VBox(20);
	        centerLeft.getChildren().addAll(statsLabel, statsListView);

	        VBox centerRight = new VBox(20);
	        centerRight.getChildren().addAll(blackListedLabel, blackListedPlayers);
	        
	        VBox centerButtons = new VBox(40);
	        centerButtons.setAlignment(Pos.CENTER);
	        center.setPadding(new Insets(40));
	        centerButtons.getChildren().addAll(stats, blackList, draft, quit);	        
	        center.setCenter(centerButtons);
	        center.setPadding(new Insets(40, 40, 40, 40));
	        center.setLeft(centerLeft);
	        center.setRight(centerRight);

	        VBox right = new VBox(20);
	        right.getChildren().addAll(drafted, draftedPlayers);

	        HBox top = new HBox();
	        Image NFLImage = new Image("file:///C:\\Users\\Lugo\\Pictures\\untitled.png");
	        ImageView NFLImageView = new ImageView(NFLImage);
	        top.setAlignment(Pos.CENTER);
	        top.getChildren().add(NFLImageView);

	        root.setLeft(left);
	        root.setTop(top);
	        root.setCenter(center);
	        root.setRight(right);

	        Scene scene = new Scene(root);

	        primaryStage.setMaximized(true);
	        primaryStage.setTitle("NFL Draft 2018");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    private int indexToInt(ObservableList index) {
	    	String string = index.toString();
	        int int1;
	        switch (string) {
	            case "[0]":
	                int1 = 0;
	                return int1;
	            case "[1]":
	                int1 = 1;
	                return int1;
	            case "[2]":
	                int1 = 2;
	                return int1;
	            case "[3]":
	                int1 = 3;
	                return int1;
	            case "[4]":
	                int1 = 4;
	                return int1;
	            case "[5]":
	                int1 = 5;
	                return int1;
	            case "[6]":
	                int1 = 6;
	                return int1;
	            case "[7]":
	                int1 = 7;
	                return int1;
	            case "[8]":
	                int1 = 8;
	                return int1;
	            case "[9]":
	                int1 = 9;
	                return int1;
	            case "[10]":
	                int1 = 10;
	                return int1;
	            case "[11]":
	                int1 = 11;
	                return int1;
	            case "[12]":
	                int1 = 12;
	                return int1;
	            case "[13]":
	                int1 = 14;
	                return int1;
	            case "[14]":
	                int1 = 14;
	                return int1;
	            case "[15]":
	                int1 = 15;
	                return int1;
	            case "[16]":
	                int1 = 16;
	                return int1;
	            case "[17]":
	                int1 = 17;
	                return int1;
	            case "[18]":
	                int1 = 18;
	                return int1;
	            case "[19]":
	                int1 = 19;
	                return int1;
	            default:
	                break;
	        }
	        return -1;
	    }
		public static void main(String[] args) {
			launch(args);
		}
	}
