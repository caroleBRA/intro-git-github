@EActivity(R.layout.main_activity)
public class MainActivity extends AppCompatActivity{
@ViewById(R.id.my_text_view)
TextView myTextView;

@AfterView
public void showHelloCarole(){
myTextView.setText("Hello Carole BRA");
}
}
