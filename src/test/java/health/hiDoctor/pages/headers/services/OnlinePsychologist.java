package health.hiDoctor.pages.headers.services;

import health.hiDoctor.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlinePsychologist extends BasePage {

    public String onlinePsychologistPageTitle = "Online Psikolog ile Online Terapi Ayarla | HiDoctor";

    @FindBy(xpath = "//button[contains(@id,'headlessui-disclosure-button-:r')]/../../h4")
    public WebElement FAQ_TITLE;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[1]")
    public WebElement QUESTION_ONE_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[2]")
    public WebElement QUESTION_TWO_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[3]")
    public WebElement QUESTION_THREE_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[4]")
    public WebElement QUESTION_FOUR_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[5]")
    public WebElement QUESTION_FIVE_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[6]")
    public WebElement QUESTION_SIX_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[7]")
    public WebElement QUESTION_SEVEN_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[8]")
    public WebElement QUESTION_EIGHT_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[9]")
    public WebElement QUESTION_NINE_BTN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[1]/span")
    public WebElement QUESTION_ONE_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[2]/span")
    public WebElement QUESTION_TWO_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[3]/span")
    public WebElement QUESTION_THREE_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[4]/span")
    public WebElement QUESTION_FOUR_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[5]/span")
    public WebElement QUESTION_FIVE_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[6]/span")
    public WebElement QUESTION_SIX_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[7]/span")
    public WebElement QUESTION_SEVEN_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[8]/span")
    public WebElement QUESTION_EIGHT_TEXT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[9]/span")
    public WebElement QUESTION_NINE_TEXT;

    public String FAQ_Title = "Sıkça Sorulan Sorular";
    public String questionOne = "Online Psikologlar hakkında nasıl bilgi alabilirim?";
    public String questionTwo = "Danışmanımı seçtim. Ödemeyi nasıl gerçekleştireceğim?";
    public String questionThree = "18 yaşından küçüğüm. Online danışmanlık hizmetinden yararlanabilir miyim?";
    public String questionFour = "Online Psikolog hizmeti hangi yöntemlerle gerçekleşmektedir?";
    public String questionFive = "Online Psikolog hizmetinden nasıl yararlanabilirim?";
    public String questionSix = "Online Psikolog görüşmelerim kayıt altına alınıyor mu?";
    public String questionSeven = "Online Psikoloğumla hangi saatler içerisinde görüşebilirim?";
    public String questionEight = "HiDoctor Online Psikolog hizmetini hangi durumlarda kullanmamalıyım?";
    public String questionNine = "HiDoctor ile nasıl iletişime geçebilirim?";

    public String answerOne = "Her danışmanın diploma ve sertifikaları HiDoctor tarafından kontrol edildikten sonra sisteme eklenmektedir. Danışmanlar alanında uzman kişilerden oluşmaktadır. Haklarında ayrıntılı bilgi edinmek için danışmanların ‘Hakkımda’ kısımlarına göz atabilirsiniz.";
    public String answerTwo = "İhtiyacınıza uygun danışmanı seçtikten sonra ödeme kısmından banka/kredi kartı veya cüzdan bakiyeniz ile güvenli bir şekilde ödeme yapabilirsiniz.";
    public String answerThree = "Kanunlar gereği 18 yaşından küçük bireylere online psikolojik danışmanlık hizmeti verilmemektedir.";
    public String answerFour = "İhtiyacınıza uygun psikoloğu seçtikten sonra, seansınızı görüntülü veya sesli olarak gerçekleştirebilirsiniz. Görüşmenize HiDoctor web sitesi veya uygulaması üzerinden katılabilirsiniz.";
    public String answerFive = "Online Psikolog hizmetine, platformdaki psikologlar arasından seçiminizi yaparak başlayabilirsiniz. Seçtiğiniz psikolog ‘Çevrim içi’ ise hemen görüşebilir veya ileri bir tarihe randevunuzu oluşturabilirsiniz.";
    public String answerSix = "Psikoloğunuz ile yaptığınız görüşmeler size özeldir. Sesli veya görüntülü görüşmeleriniz HiDoctor  tarafından kayıt altına alınmaz ve üçüncü şahıslar tarafından erişilemez. ";
    public String answerSeven = "Seçtiğiniz psikoloğun çalışma saatlerini profil sayfasında bulunan ‘Takvim’ bölümünden görüntüleyebilir, uygunluk durumuna göre hemen görüşmenize başlayabilir veya ‘Randevu Al’ bölümünden ileri tarihli randevunuzu oluşturabilirsiniz.";
    public String answerEight = "HiDoctor online psikolog hizmeti, uzman ve lisanslı psikologlar tarafından verilen psikolojik danışmanlık hizmetini kapsamaktadır. Hizmet kapsamında ilaç ve reçete yazılmamaktadır. Kriz anında, ilaç tedavisi veya tanı konulması gereken durumlarda bir sağlık kuruluşuna danışınız.";
    public String answerNine = "Bizimle 0850 700 03 03 - müşteri hizmetleri numaramızdan, Whatsapp ve destek e-mail adresimiz üzerinden iletişime geçebilirsiniz. Detaylı bilgilendirme için Bize Ulaşın kısmına bakabilirsiniz. Haftanın her günü 09:00-23:59 arasında hizmet verilmektedir.";

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[1]/../div/div")
    public WebElement ANSWER_ONE;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[2]/../div/div")
    public WebElement ANSWER_TWO;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[3]/../div/div")
    public WebElement ANSWER_THREE;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[4]/../div/div")
    public WebElement ANSWER_FOUR;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[5]/../div/div")
    public WebElement ANSWER_FIVE;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[6]/../div/div")
    public WebElement ANSWER_SIX;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[7]/../div/div")
    public WebElement ANSWER_SEVEN;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[8]/../div/div")
    public WebElement ANSWER_EIGHT;

    @FindBy(xpath = "(//button[contains(@id,'headlessui-disclosure-button-:r')])[9]/../div/div")
    public WebElement ANSWER_NINE;


}
