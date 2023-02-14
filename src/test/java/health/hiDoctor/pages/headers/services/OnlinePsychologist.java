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

    @FindBy(xpath = "//img[@alt='app-download-qr']")
    public WebElement QR_CODE;

    @FindBy(xpath = "//img[@alt='app-download-qr']/../../../div[2]/h3")
    public WebElement DOWNLOAD_APP_TITLE;

    @FindBy(xpath = "//img[@alt='app-download-qr']/../../../div[2]/h5")
    public WebElement DOWNLOAD_APP_TEXT;

    public String downloadAppTitle = "Uygulamayı İndir";
    public String downloadAppText = "İstediğiniz bilgiye, istediğiniz zaman, istediğiniz yerden kolayca ulaşabilirsiniz.";

    @FindBy(xpath = "(//a[@data-testid='download-app-link-App Store'])[1]")
    public WebElement APP_STORE_BTN;

    @FindBy(xpath = "(//a[@data-testid='download-app-link-Google Play'])[1]")
    public WebElement GOOGLE_PLAY_BTN;

    @FindBy(xpath = "(//a[@data-testid='download-app-link-App Gallery'])[1]")
    public WebElement APP_GALLERY_BTN;

    @FindBy(xpath = "//img[@alt='Uygulamayı İndir']")
    public WebElement DOWNLOAD_APP_IMAGE;

    @FindBy(xpath = "(//a[@data-testid='download-app-link-App Store'])[1]/p")
    public WebElement APP_STORE_TEXT;

    @FindBy(xpath = "(//a[@data-testid='download-app-link-Google Play'])[1]/p")
    public WebElement GOOGLE_PLAY_TEXT;

    @FindBy(xpath = "(//a[@data-testid='download-app-link-App Gallery'])[1]/p")
    public WebElement APP_GALLERY_TEXT;

    @FindBy(xpath = "(//div[@data-testid='carousel-component'])[4]/../h2")
    public WebElement CERTIFICATES_TITLE;

    @FindBy(xpath = "(//button[@aria-label='Previous slide'])[2]")
    public WebElement PREVIOUS_BUTTON_CERTIFICATE;

    @FindBy(xpath = "(//button[@aria-label='Next slide'])[2]")
    public WebElement NEXT_BUTTON_CERTIFICATE;

    @FindBy(xpath = "(//div[@data-testid='slides'])[1]/div/div/span")
    public WebElement HEALTH_CERTIFICATE_LOGO;

    @FindBy(xpath = "(//div[@data-testid='slides'])[1]/div/div[2]/p[1]")
    public WebElement HEALTH_CERTIFICATE_SUBTITLE;

    @FindBy(xpath = "(//div[@data-testid='slides'])[1]/div/div[2]/p[2]")
    public WebElement HEALTH_CERTIFICATE_TEXT;

    @FindBy(xpath = "(//div[@data-testid='slides'])[2]/div/div/span")
    public WebElement SPICE_LOGO;

    @FindBy(xpath = "(//div[@data-testid='slides'])[2]/div/div[2]/p[1]")
    public WebElement SPICE_SUBTITLE;

    @FindBy(xpath = "(//div[@data-testid='slides'])[2]/div/div[2]/p[2]")
    public WebElement SPICE_TEXT;

    @FindBy(xpath = "(//div[@data-testid='slides'])[3]/div/div/span")
    public WebElement ISO_45003_LOGO;

    @FindBy(xpath = "(//div[@data-testid='slides'])[3]/div/div[2]/p[1]")
    public WebElement ISO_45003_SUBTITLE;

    @FindBy(xpath = "(//div[@data-testid='slides'])[3]/div/div[2]/p[2]")
    public WebElement ISO_45003_TEXT;

    @FindBy(xpath = "(//div[@data-testid='slides'])[4]/div/div/span")
    public WebElement ISO_27001_LOGO;

    @FindBy(xpath = "(//div[@data-testid='slides'])[4]/div/div[2]/p[1]")
    public WebElement ISO_27001_SUBTITLE;

    @FindBy(xpath = "(//div[@data-testid='slides'])[4]/div/div[2]/p[2]")
    public WebElement ISO_27001_TEXT;

    @FindBy(xpath = "(//div[@data-testid='slides'])[5]/div/div/span")
    public WebElement ISO_20000_LOGO;

    @FindBy(xpath = "(//div[@data-testid='slides'])[5]/div/div[2]/p[1]")
    public WebElement ISO_20000_SUBTITLE;

    @FindBy(xpath = "(//div[@data-testid='slides'])[5]/div/div[2]/p[2]")
    public WebElement ISO_20000_TEXT;

    @FindBy(xpath = "(//div[@data-testid='slides'])[6]/div/div/span")
    public WebElement ETBIS_LOGO;

    @FindBy(xpath = "(//div[@data-testid='slides'])[6]/div/div[2]/p[1]")
    public WebElement ETBIS_SUBTITLE;

    @FindBy(xpath = "(//div[@data-testid='slides'])[6]/div/div[2]/p[2]")
    public WebElement ETBIS_TEXT;

    public String certificatesTitle = "Sertifikalarımız";
    public String healthCertificateSubTitle = "Tescilli";
    public String healthCertificateText = "Sağlık Bakanlığı Uzaktan Sağlık Bilgi Sistemi";
    public String SPICESubTitle = "Nitelikli";
    public String SPICEText = "(SPICE) Yazılım Süreç Değerlendirme Sistemi";
    public String ISO45003SubTitle = "Uzman";
    public String ISO45003SubText = "İş Yerinde Psikolojik Sağlık ve Güvenlik";
    public String ISO27001SubTitle = "Bilgi Güvenliği";
    public String ISO27001SubText = "Bilgi Güvenliği Yönetim Sistemi";
    public String ISO20000SubTitle = "Yetkin";
    public String ISO20000SubText = "Bilgi Teknolojileri Hizmet Yönetim Sistemi";
    public String ETBISSubTitle = "Kayıtlı";
    public String ETBISText = "Elektronik Ticaret Bilgi Sistemi";

    @FindBy(xpath = "//div[@class='pb-14']/div/div/div/div[1]/span[1]")
    public WebElement USER_ANALYTIC;

    @FindBy(xpath = "//div[@class='pb-14']/div/div/div/div[1]/span[2]")
    public WebElement USER_TEXT;

    @FindBy(xpath = "//div[@class='pb-14']/div/div/div/div[2]/span[1]")
    public WebElement VIDEO_CALL_ANALYTIC;

    @FindBy(xpath = "//div[@class='pb-14']/div/div/div/div[2]/span[2]")
    public WebElement VIDEO_CALL_TEXT;

    @FindBy(xpath = "//div[@class='pb-14']/div/div/div/div[3]/span[1]")
    public WebElement VOICE_CALL_ANALYTIC;

    @FindBy(xpath = "//div[@class='pb-14']/div/div/div/div[3]/span[2]")
    public WebElement VOICE_CALL_TEXT;

    @FindBy(xpath = "//div[@class='pb-14']/div/div/div/div[4]/span[1]")
    public WebElement CONSULTANT_ANALYTIC;

    @FindBy(xpath = "//div[@class='pb-14']/div/div/div/div[4]/span[2]")
    public WebElement CONSULTANT_TEXT;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/h2")
    public WebElement HOW_CREATE_ONLINE_CALL_TITLE;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/div[2]/div[1]/div[2]/h5")
    public WebElement HOW_CREATE_ONLINE_CALL_STEP1_TITLE;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/div[2]/div[1]/div[2]/div")
    public WebElement HOW_CREATE_ONLINE_CALL_STEP1_TEXT;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/div[2]/div[2]/div[2]/h5")
    public WebElement HOW_CREATE_ONLINE_CALL_STEP2_TITLE;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/div[2]/div[2]/div[2]/div")
    public WebElement HOW_CREATE_ONLINE_CALL_STEP2_TEXT;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/div[2]/div[3]/div[2]/h5")
    public WebElement HOW_CREATE_ONLINE_CALL_STEP3_TITLE;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/div[2]/div[3]/div[2]/div")
    public WebElement HOW_CREATE_ONLINE_CALL_STEP3_TEXT;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/div[2]/div[4]/div[2]/h5")
    public WebElement HOW_CREATE_ONLINE_CALL_STEP4_TITLE;

    @FindBy(xpath = "//div[@class='mx-auto max-w-[1200px] px-2 pb-4 text-center']/div[2]/div[4]/div[2]/div")
    public WebElement HOW_CREATE_ONLINE_CALL_STEP4_TEXT;

    public String howCreateOnlineCallTitle = "Online Görüşme Nasıl Oluşturulur?";
    public String howCreateOnlineCallTitleStep1Title = "1. Psikoloğunu Seç";
    public String howCreateOnlineCallTitleStep1Text = "Sistemimizdeki psikologların uzmanlık alanlarını ihtiyacına göre filtreleyebilir, eğitim ve sertifikalarını inceleyerek sana en uygun psikoloğu seçebilirsin.";
    public String howCreateOnlineCallTitleStep2Title = "2. Görüşmeni Planla";
    public String howCreateOnlineCallTitleStep2Text = "Sesli ya da görüntülü görüşebilir, görüşme süresine karar verebilirsin. Hemen başlayabilir veya sana en uygun tarihe randevunu oluşturabilirsin.";
    public String howCreateOnlineCallTitleStep3Title = "3. Ödemeni Tamamla";
    public String howCreateOnlineCallTitleStep3Text = "Online olarak banka/kredi kartı ya da cüzdan bakiyen ile ödeme seçeneklerinden birini tercih ederek güvenli ve hızlı bir şekilde ödemeni tamamlayabilirsin. ";
    public String howCreateOnlineCallTitleStep4Title = "4. Seansına Başla!";
    public String howCreateOnlineCallTitleStep4Text = "Randevu saatinde, sisteme giriş yaparak görüşmeye başlayabilirsin. HiDoctor uygulaması ya da web sitemiz üzerinden görüşmeni gerçekleştirebilirsin.";

    @FindBy(xpath = "//div[@class='w-full lg:my-12 lg:flex-1']/p")
    public WebElement HOW_DO_WE_CHOOSE_CONSULTANTS_TITLE;

    @FindBy(xpath = "//div[@class='w-full lg:my-12 lg:flex-1']/div/ul/li[1]")
    public WebElement HOW_DO_WE_CHOOSE_CONSULTANTS_FIRST_PARAG;

    @FindBy(xpath = "//div[@class='w-full lg:my-12 lg:flex-1']/div/ul/li[2]")
    public WebElement HOW_DO_WE_CHOOSE_CONSULTANTS_SECOND_PARAG;

    @FindBy(xpath = "//div[@class='w-full lg:my-12 lg:flex-1']/a")
    public WebElement BECOME_CONSULTANT;

    public String howDoWeChooseConsultantsTitle = "Danışmanlarımızı Nasıl Seçiyoruz?";
    public String howDoWeChooseConsultantsFirstParag = "HiDoctor platformundaki danışmanları seçerken yüksek lisans eğitimini tamamlamış, alanında uzman klinik psikologları aşamalı bir mülakat sürecine tabi tutuyoruz.";
    public String howDoWeChooseConsultantsSecondParag = "Mülakat sürecinin ardından HiDoctor Danışman Heyeti tarafından diplomaları ve sertifikaları onaylanmış, deneyimli uzmanlar ile iş birliği yapıyoruz. Bunu sizlere daha güvenli bir hizmet sağlamak amacıyla gerçekleştiriyoruz.";
    public String becomeConsultant = "Şimdi Danışman Ol";

    @FindBy(xpath = "//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/h3")
    public WebElement WHY_SHOULD_I_CHOOSE_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/h2)[1]")
    public WebElement SECURE_AND_PRIVATE_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/p)[1]")
    public WebElement SECURE_AND_PRIVATE_TEXT;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/h2)[2]")
    public WebElement GUARANTEED_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/p)[2]")
    public WebElement GUARANTEED_TEXT;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/h2)[3]")
    public WebElement EXPERT_CLINICAL_PSYCHOLOGISTS_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/p)[3]")
    public WebElement EXPERT_CLINICAL_PSYCHOLOGISTS_TEXT;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/h2)[4]")
    public WebElement EVIDENCE_BASED_THERAPY_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/p)[4]")
    public WebElement EVIDENCE_BASED_THERAPY_TEXT;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/h2)[5]")
    public WebElement VOICE_AND_VIDEO_CALLS_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/p)[5]")
    public WebElement VOICE_AND_VIDEO_CALLS_TEXT;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/h2)[6]")
    public WebElement ACCESSIBLE_AND_TIMESAVING_TITLE;

    @FindBy(xpath = "(//div[@class='mt-4 bg-opacity-50 pt-6 md:pt-5']/div/div/div/p)[6]")
    public WebElement ACCESSIBLE_AND_TIMESAVING_TEXT;

    @FindBy(xpath = "(//div[@class='container  flex items-center py-3 ']/span)[1]")
    public WebElement HOME_ICON;

    @FindBy(xpath = "(//div[@class='container  flex items-center py-3 ']/span)[2]")
    public WebElement ONLINE_PSYCHOLOGIST_TITLE;

    @FindBy(xpath = "//div[@class='pb-6 lg:pb-6 xl:pb-20']/h1")
    public WebElement ONLINE_PSYCHOLOGIST_H1_TITLE;

    @FindBy(xpath = "//div[@class='pb-6 lg:pb-6 xl:pb-20']/div/p[1]")
    public WebElement ONLINE_PSYCHOLOGIST_SUBTITLE1;

    @FindBy(xpath = "//div[@class='pb-6 lg:pb-6 xl:pb-20']/div/p[2]")
    public WebElement ONLINE_PSYCHOLOGIST_SUBTITLE2;

    @FindBy(xpath = "//div[@class='pb-6 lg:pb-6 xl:pb-20']/div/p[3]")
    public WebElement ONLINE_PSYCHOLOGIST_SUBTITLE3;

    public String onlinePsychologistH1Title = "Modunu Yakalamak İçin Psikoloğunla Tanış";
    public String onlinePsychologistSubtitle1 = "Alanında Uzman Psikologlar";
    public String onlinePsychologistSubtitle2 = "Sesli ve Görüntülü Görüşme";
    public String onlinePsychologistSubtitle3 = "Güvenilir ve Gizli";

    @FindBy(xpath = "(//div[@class='swiper-wrapper'])[1]")
    public WebElement TEXT_SLIDER;

    @FindBy(xpath = "(//div[@class='swiper-slide swiper-slide-active'])[1]")
    public WebElement CENTRE_TEXT_SLIDER;

    @FindBy(xpath = "//div[@class='swiper-slide swiper-slide-prev']")
    public WebElement LEFT_TEXT_SLIDER;

    @FindBy(xpath = "//div[@class='swiper-slide swiper-slide-next']")
    public WebElement RIGHT_TEXT_SLIDER;

    @FindBy(xpath = "((//div[@class='swiper-slide swiper-slide-active'])[1]/div/div/p)[2]")
    public WebElement CENTRE_TEXT_SLIDER_TEXT_CONTENT;








}
