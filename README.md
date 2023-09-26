# atividade-avaliativa-construcao-de-software-solid-ifpr

Atividade Avaliativa do terceiro trimestre da disciplina de construção de software sobre os princípios SOLID e Refatoração.

Os exercícios estão disponíveis em: https://drive.google.com/file/d/1pZs2aQCeUInktfmfsp-YmHGWVlUR8DPb/view?usp=sharing

Para a solução dos exercícios foi utilizada a IDE Intellij e a extensão plantUml que pode ser adicionada em file/settings/plugins dentro da IDE.

Os testes de cada exercícios estao implementados na pasta /test/java presente no projeto, mas é preciso que cada arquivo seja executado separadamente.

Respostas às questões teóricas:

1: Sim, é possível reescrever o código apresentado no exercício através do uso de polimorfismo e herança. Na solução presente no arquivo ex1.puml
foi possível o reúso de código através da herança quando as classes Dançarina, Programadora e Cantora herdam a classe Pessoa. Tambés foi respeitado
o princípio SOLID Dependency Inversion e Interface Segregation ao serem utilizadas as abtrações ProgramadoraService, CantoraService e DancarinaService e PessoaService.
Além disso foi respeitado o princípio Single Responsibility quando cada service implementa sua lógica exclusiva, lembrando que em java uma interface
pode oferecer uma implementação padrão para seus métodos, o que ocorre no caso de PessoaService e por isso não há um PessoaServiceImplm ,
mas não foi utilizado o modificador Final nos métodos aprender(), caminhar() e comer() pois pessoas não realizam tarefas da mesma forma,
o que torna possível a sobrescrita desses metodos nos services que as implementam indiretamente.

2: No exercícios dois possível a reescrita através do uso de herança e polimorfismo. Ao apresentar uma solução fiquei em dúvida se FormaGeometrica deveria
ser uma classe abstrata ou um interface, mas como não havia atributos universais decidi por utilizar uma interface. Na solução apresentada foi utilizado o
design patter Strategy que permitiu a eliminação dos if/else e tornou o código extensível já que podem ser adicionadas novas formas geometricas sem comprometer
a qualidade do código existente. Também foi respeitado o princípio Single Responsibility quando Quadrado, Triangulo e Circulo implementam suas proprias formas de calcular a área.


