
/* Cross-Platform Application Engine Object
    - AuthHandler         : Anonymous or Authenticated application usage
    - FirebaseHandler     : Connect and interract with firebase
    - AdmobHandler        : Load and show methods for Admob ads
    - UserInputHandler    : Collect user input
    - AssetHandler        : Load all assets from a load register
    - BehaviourHandler    : Update AssetHandler parameters depending on behaviour scripts
    - DebugLogger         : Print debug messages under INPUT, ASSET and SCRIPT tags
    - DisplayHandler      : Show live application on screen
    - StatusLogger        : Print status messages under EXECUTED, FAILURE and EXTRA
*/

class AyimaonEnigne extends Game {
  private AuthHandler auth;
  private FirebaseHandler firebase;
  private UserInputHandler userInput;
  private AssetHandler assets;
  private BehaviourHandler behaviour;
  private DebugLogger debugLog;
  private DisplayHandler display;
  private StatusLogger statusLog;

  /**
  *
  ----------------------------------------------------------------------------*/
  public AyimaonEnigne(String PROJECT_DIR){
    loadEngine(PROJECT_DIR);
  }

  /**
  *
  ----------------------------------------------------------------------------*/
  public void loadEngine(String PROJECT_DIR){
    this->userInput = new UserInputHandler();
    this->assets = new AssetHandler(PROJECT_DIR);
    this->behaviour = new BehaviourHandler(PROJECT_DIR);
    this->debugLog = new DebugLogger();
    this->display = new DisplayHandler(PROJECT_DIR);
    this->statusLog = new StatusLogger();

  /**
  *
  ----------------------------------------------------------------------------*/
  public void update(){
    userInput.update();
    assets.update();
    behaviour.update();
    debugLog.update();
    display.update();
    statusLog.update();
  }
}
