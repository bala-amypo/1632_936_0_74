import com.example.demo.service.TimeStampService;

@RestController

public class Controller{
    @Autowired TimeStampService ser;

    @PostMapping("/Tpost")
    public TimeStampEntity sendData(@RequestBody TimeStampEntity stu){
        return ser.postData(stu);

    }