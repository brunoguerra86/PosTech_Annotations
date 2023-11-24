
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyProjectTest{

}

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyProjectTest{
    
    @MockBean
    private MyService myService;
}

@DataJpaTest
public class MyDataJpaTest{

}

@SpringBootTest
@AutoConfigureMockMvc
public class MyControllerTest{

    @Autowired
    private MockMvc mockmvc;
}