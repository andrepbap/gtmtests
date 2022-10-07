import UIKit
import FirebaseAnalytics

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBOutlet weak var button1: UIButton!
    
    @IBAction func tap(_ sender: Any) {
        Analytics.logEvent("share_image", parameters: [
          "image_name": "xablau.jpg",
          "full_text": "xablau"
        ])
    }
    
}

