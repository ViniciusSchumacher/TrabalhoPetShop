/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import petshop.models.Animal;
import petshop.models.BanhoTosa;
import petshop.models.Consulta;
import petshop.models.ENUM.TipoAnimalEnum;
import petshop.models.Endereco;
import petshop.models.Exame;
import petshop.models.Medicamento;
import petshop.models.Medico;
import petshop.models.ProprietarioAnimal;
import petshop.models.Vacina;

/**
 *
 * @author Vinicius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Criação ArrayLists
        ArrayList<Animal> animalArray = new ArrayList<>();
        ArrayList<BanhoTosa> banhoArray = new ArrayList<>();
        ArrayList<Consulta> consultaArray = new ArrayList<>();
        ArrayList<Endereco> enderecoArray = new ArrayList<>();
        ArrayList<Exame> exameArray = new ArrayList<>();
        ArrayList<Medicamento> medicamentoArray = new ArrayList<>();
        ArrayList<Medico> medicoArray = new ArrayList<>();
        ArrayList<ProprietarioAnimal> proprietarioAnimalArray = new ArrayList<>();
        ArrayList<Vacina> vacinaArray = new ArrayList<>();

        //Inserção clientes e animais p/ histórico
        Endereco enderecoVinicius = new Endereco("Rua Santos Dumont", 2885, "85900-010", "Centro", "Toledo");
        ProprietarioAnimal vinicius = new ProprietarioAnimal("Vinicius Schumacher", "092.524.079-60", enderecoVinicius, "45998601312");
        proprietarioAnimalArray.add(vinicius);
        TipoAnimalEnum tipoAnimalVinicius = TipoAnimalEnum.CACHORRO;
        TipoAnimalEnum tipoAnimalVinicius2 = TipoAnimalEnum.GATO;
        Animal animalVinicius = new Animal("Bruno", tipoAnimalVinicius, vinicius);
        Animal animalVinicius2 = new Animal("Aurora", tipoAnimalVinicius2, vinicius);
        animalArray.add(animalVinicius);
        animalArray.add(animalVinicius2);

        Endereco enderecoGustavo = new Endereco("Rua Taboao da Serra", 190, "85915-870", "Vila Industrial", "Toledo");
        ProprietarioAnimal gustavo = new ProprietarioAnimal("Gustavo Padilha", "155.359.874-90", enderecoGustavo, "45984471553");
        proprietarioAnimalArray.add(gustavo);
        TipoAnimalEnum tipoAnimalGustavo = TipoAnimalEnum.PASSARO;
        TipoAnimalEnum tipoAnimalGustavo2 = TipoAnimalEnum.COELHO;
        Animal animalGustavo = new Animal("Francisco", tipoAnimalGustavo, gustavo);
        Animal animalGustavo2 = new Animal("Severina", tipoAnimalGustavo2, gustavo);
        animalArray.add(animalGustavo);
        animalArray.add(animalGustavo2);

        Endereco enderecoManoel = new Endereco("Rua Joana D Arc", 155, "85446-301", "Pioneira", "Toledo");
        ProprietarioAnimal manoel = new ProprietarioAnimal("Manoel das Flores", "158.669.471-15", enderecoManoel, "4499853-4771");
        proprietarioAnimalArray.add(manoel);
        TipoAnimalEnum tipoAnimalManoel = TipoAnimalEnum.PORQUINHO_INDIA;
        TipoAnimalEnum tipoAnimalManoel2 = TipoAnimalEnum.CACHORRO;
        Animal animalManoel = new Animal("Indiozinho", tipoAnimalManoel, manoel);
        Animal animalManoel2 = new Animal("Brutus", tipoAnimalManoel2, manoel);
        animalArray.add(animalManoel);
        animalArray.add(animalManoel2);

        //Inserção médicos
        Endereco enderecoMedAnderson = new Endereco("Rua Parigot de Souza", 185, "85901-170", "Centro", "Toledo");
        Medico medAnderson = new Medico("Anderson Bosing", "123456", enderecoMedAnderson, "45991055223");
        Endereco enderecoMedFernando = new Endereco("Rua Santos Dumont", 2558, "85210-330", "Centro", "Toledo");
        Medico medFernando = new Medico("Fernando Botelho", "789123", enderecoMedFernando, "4532201415");
        Endereco enderecoMedPaulo = new Endereco("Rua Barao do Rio Branco", 321, "85907-320", "Jardim Gisela", "Toledo");
        Medico medPaulo = new Medico("Paulo dos Santos", "456789", enderecoMedPaulo, "4598634558");
        medicoArray.add(medAnderson);
        medicoArray.add(medFernando);
        medicoArray.add(medPaulo);

        //Inserção medicamentos
        Medicamento rivotril = new Medicamento("Rivotril canino", "Utilizado para ajudar caes com ansiedade", 1, 49.90, true, 2);
        Medicamento dipirona = new Medicamento("Dipirona canino", "Utilizado para dor de cabeca do cachorro", 2, 29.90, true, 12);
        Medicamento dorflex = new Medicamento("Dorflex para gatos", "Utilizado para diminuir as dores musculares do gato", 3, 59.90, true, 10);
        Medicamento meloxican = new Medicamento("Meloxican para porquinho da india", "Antiinflamatorio para porcos da india", 4, 25.90, false, 0);
        medicamentoArray.add(rivotril);
        medicamentoArray.add(dipirona);
        medicamentoArray.add(dorflex);
        medicamentoArray.add(meloxican);

        //Inserção vacinas
        Vacina h1n1 = new Vacina("H1N1", "Vacina contra a gripe suina para caes", 59.90, 1, true, 12);
        Vacina covid = new Vacina("Coronavac", "Vacina contra o COVID-19", 29.90, 2, true, 15);
        Vacina hepatite = new Vacina("Hepatite", "Vacina contra e hepatite B", 35.90, 3, true, 20);
        Vacina sarna = new Vacina("Sarna", "Vacina contra a sarna", 15.90, 4, true, 30);
        Vacina raiva = new Vacina("Raiva", "Vacina contra a raiva", 28.90, 5, true, 10);
        vacinaArray.add(h1n1);
        vacinaArray.add(covid);
        vacinaArray.add(hepatite);
        vacinaArray.add(sarna);
        vacinaArray.add(raiva);

        //Inserção banho/tosa
        BanhoTosa banho1 = new BanhoTosa(1, "Banho completo do Bruno", animalVinicius, LocalDateTime.of(2022, 7, 22, 15, 00), 35.00);
        BanhoTosa banho2 = new BanhoTosa(2, "Banho completo do Bruno", animalVinicius, LocalDateTime.of(2022, 8, 15, 10, 00), 30.00);
        BanhoTosa banho3 = new BanhoTosa(3, "Banho completo da Aurora", animalVinicius2, LocalDateTime.of(2022, 5, 5, 17, 00), 28.00);
        BanhoTosa banho4 = new BanhoTosa(4, "Tosa completa do Brutus", animalManoel2, LocalDateTime.of(2022, 7, 14, 9, 30), 30.00);
        BanhoTosa banho5 = new BanhoTosa(5, "Banho completo da Severina", animalGustavo2, LocalDateTime.of(2022, 7, 1, 13, 45), 30.00);
        BanhoTosa banho6 = new BanhoTosa(6, "Banho completo da Severina", animalGustavo2, LocalDateTime.of(2022, 10, 1, 13, 45), 30.00);
        BanhoTosa banho7 = new BanhoTosa(7, "Banho completo da Severina", animalGustavo2, LocalDateTime.of(2022, 11, 1, 13, 45), 30.00);
        BanhoTosa banho8 = new BanhoTosa(8, "Banho completo da Severina", animalGustavo2, LocalDateTime.of(2022, 12, 1, 13, 45), 30.00);
        banhoArray.add(banho1);
        banhoArray.add(banho2);
        banhoArray.add(banho3);
        banhoArray.add(banho4);
        banhoArray.add(banho5);
        banhoArray.add(banho6);
        banhoArray.add(banho7);
        banhoArray.add(banho8);

        //Inserção exames
        Exame exame1 = new Exame(1, "Exame toxicologico do Bruno", 100.90, animalVinicius, LocalDateTime.of(2022, 7, 15, 8, 30));
        Exame exame2 = new Exame(2, "Exame completo do Bruno", 377.90, animalVinicius, LocalDateTime.of(2022, 7, 16, 14, 00));
        Exame exame3 = new Exame(3, "Exame completo da Aurora", 259.90, animalVinicius2, LocalDateTime.of(2022, 7, 1, 16, 15));
        Exame exame4 = new Exame(4, "Exame completo do Francisco", 59.90, animalGustavo, LocalDateTime.of(2022, 8, 25, 10, 30));
        Exame exame5 = new Exame(5, "Exame completo do Indiozinho", 129.90, animalManoel, LocalDateTime.of(2022, 8, 9, 11, 30));
        Exame exame6 = new Exame(6, "Exame completo do Brutus", 377.90, animalGustavo2, LocalDateTime.of(2022, 7, 28, 9, 30));
        exameArray.add(exame1);
        exameArray.add(exame2);
        exameArray.add(exame3);
        exameArray.add(exame4);
        exameArray.add(exame5);
        exameArray.add(exame6);

        //Inserção consultas
        Consulta consulta1 = new Consulta();
        consulta1.setId(1);
        consulta1.setDescricao("Consulta por problema de audicao do Bruno");
        consulta1.setAnimalConsulta(animalVinicius);
        consulta1.setMedicoConsulta(medAnderson);
        consulta1.MedicamentoConsulta().add(rivotril);
        consulta1.ExameConsulta().add(exame1);
        consulta1.ExameConsulta().add(exame2);
        consulta1.VacinaConsulta().add(h1n1);
        consulta1.VacinaConsulta().add(covid);
        consulta1.setValorConsulta(159.90);
        consulta1.setDataConsulta(LocalDateTime.of(2022, 7, 17, 10, 20));
        consulta1.CalculoVlrTotal();
        consulta1.setDataProximaConsulta(LocalDateTime.of(2022, 8, 17, 15, 30));

        Consulta consulta2 = new Consulta();
        consulta2.setId(2);
        consulta2.setDescricao("Consulta anual da Aurora");
        consulta2.setAnimalConsulta(animalVinicius2);
        consulta2.setMedicoConsulta(medFernando);
        consulta2.ExameConsulta().add(exame3);
        consulta2.setValorConsulta(109.90);
        consulta2.setDataConsulta(LocalDateTime.of(2022, 7, 2, 11, 00));
        consulta2.CalculoVlrTotal();
        consulta2.setDataProximaConsulta(LocalDateTime.of(2022, 8, 2, 11, 00));

        Consulta consulta3 = new Consulta();
        consulta3.setId(3);
        consulta3.setDescricao("Consulta anual do Francisco");
        consulta3.setAnimalConsulta(animalGustavo);
        consulta3.setMedicoConsulta(medPaulo);
        consulta3.ExameConsulta().add(exame4);
        consulta3.setValorConsulta(159.90);
        consulta3.setDataConsulta(LocalDateTime.of(2022, 8, 26, 16, 15));
        consulta3.CalculoVlrTotal();
        consulta3.setDataProximaConsulta(LocalDateTime.of(2022, 9, 29, 9, 45));

        Consulta consulta4 = new Consulta();
        consulta4.setId(4);
        consulta4.setDescricao("Consulta do Indiozinho");
        consulta4.setAnimalConsulta(animalManoel);
        consulta4.setMedicoConsulta(medFernando);
        consulta4.ExameConsulta().add(exame5);
        consulta4.MedicamentoConsulta().add(meloxican);
        consulta4.setValorConsulta(159.90);
        consulta4.setDataConsulta(LocalDateTime.of(2022, 8, 25, 14, 30));
        consulta4.CalculoVlrTotal();
        consulta4.setDataProximaConsulta(LocalDateTime.of(2022, 9, 25, 13, 30));

        Consulta consulta5 = new Consulta();
        consulta5.setId(5);
        consulta5.setDescricao("Consulta anual do Brutus");
        consulta5.setAnimalConsulta(animalGustavo2);
        consulta5.setMedicoConsulta(medAnderson);
        consulta5.MedicamentoConsulta().add(dipirona);
        consulta5.ExameConsulta().add(exame6);
        consulta5.VacinaConsulta().add(hepatite);
        consulta5.setValorConsulta(159.90);
        consulta5.setDataConsulta(LocalDateTime.of(2022, 7, 29, 13, 45));
        consulta5.CalculoVlrTotal();
        consulta5.setDataProximaConsulta(LocalDateTime.of(2022, 8, 29, 17, 00));

        Consulta consulta6 = new Consulta();
        consulta6.setId(6);
        consulta6.setDescricao("Consulta de praxe da Severina");
        consulta6.setAnimalConsulta(animalGustavo2);
        consulta6.setMedicoConsulta(medPaulo);
        consulta6.setValorConsulta(59.90);
        consulta6.setDataConsulta(LocalDateTime.of(2022, 6, 15, 9, 0));
        consulta6.CalculoVlrTotal();
        consulta6.setDataProximaConsulta(LocalDateTime.of(2022, 9, 27, 9, 0));

        consultaArray.add(consulta1);
        consultaArray.add(consulta2);
        consultaArray.add(consulta3);
        consultaArray.add(consulta4);
        consultaArray.add(consulta5);
        consultaArray.add(consulta6);

        //Criação das opções do programa
        boolean verificador = true;
        boolean verificador2 = true;
        boolean verificador3 = true;
        boolean verificador4 = true;

        do {

            System.out.println("\nBem-vindo ao sistema de pet shop! Escolha uma das opcoes:\n1- Cadastros;\n2- Historicos;\n3- Eventos Futuros;\n4- Sair.");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();

            if (opcao == 1) {

                do {

                    System.out.println("Qual o cadastro a ser acessado:\n1- Animais Cadastrados;\n2- Proprietarios Cadastrados;\n3- Medicos Cadastrados;"
                            + "\n4- Vacinas Cadastradas;\n5- Medicamentos Cadastrados;\n6- Voltar.");
                    int opcao2 = sc.nextInt();
                    if (opcao2 == 1) {

                        System.out.println("\nAnimais Cadastrados:");

                        for (int i = 0; i < animalArray.size(); i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("Nome: " + animalArray.get(i).getNome());
                            System.out.println("Tipo do Animal: " + animalArray.get(i).getTipoAnimal());
                            System.out.println("Nome do Dono: " + animalArray.get(i).getDonoAnimal().getNome());

                        }

                    } else if (opcao2 == 2) {

                        System.out.println("\nProprietarios Cadastrados:");

                        for (int i = 0; i < proprietarioAnimalArray.size(); i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("Nome: " + proprietarioAnimalArray.get(i).getNome());
                            System.out.println("CPF: " + proprietarioAnimalArray.get(i).getCpf());
                            System.out.println("Endereco\nRua e Numero: " + proprietarioAnimalArray.get(i).getEndereco().getLogradouro() + ", " + proprietarioAnimalArray.get(i).getEndereco().getNumero());
                            System.out.println("Bairro e Cidade: " + proprietarioAnimalArray.get(i).getEndereco().getBairro() + ", " + proprietarioAnimalArray.get(i).getEndereco().getCidade());
                            System.out.println("CEP: " + proprietarioAnimalArray.get(i).getEndereco().getCep());
                            System.out.println("Contato: " + proprietarioAnimalArray.get(i).getContato());
                            /*
                    for(int i2 = 0; i < animalArray.size(); i2++){
                    if(animalArray.get(i2).getDonoAnimal() == proprietarioAnimalArray.get(i)){
                    System.out.println("Nome animal(is): " + animalArray.get(i2).getNome());    
                    }
                    }
                             */

                        }

                    } else if (opcao2 == 3) {

                        System.out.println("\nMedicos Cadastrados:");

                        for (int i = 0; i < medicoArray.size(); i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("Nome: " + medicoArray.get(i).getNome());
                            System.out.println("CRMV: " + medicoArray.get(i).getCrmv());
                            System.out.println("Contato: " + medicoArray.get(i).getContato());
                            System.out.println("Endereco\nRua e Numero: " + medicoArray.get(i).getEndereco().getLogradouro() + ", " + medicoArray.get(i).getEndereco().getNumero());
                            System.out.println("Bairro e Cidade: " + medicoArray.get(i).getEndereco().getBairro() + ", " + medicoArray.get(i).getEndereco().getCidade());
                            System.out.println("CEP: " + medicoArray.get(i).getEndereco().getCep());
                        }

                    } else if (opcao2 == 4) {

                        System.out.println("\nVacinas Cadastradas:");

                        for (int i = 0; i < vacinaArray.size(); i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("Nome: " + vacinaArray.get(i).getNomeVacina());
                            System.out.println("Descricao: " + vacinaArray.get(i).getDescricao());
                            System.out.println("Valor: R$" + vacinaArray.get(i).getValorVacina());
                            if (vacinaArray.get(i).isDisponibilidade() == true) {
                                System.out.println("Quantidade: " + vacinaArray.get(i).getQtd());
                            } else {
                                System.out.println("Vacina nao disponivel!");
                            }
                        }

                    } else if (opcao2 == 5) {

                        System.out.println("\nMedicamentos Cadastrados:");

                        for (int i = 0; i < medicamentoArray.size(); i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("Nome: " + medicamentoArray.get(i).getNome());
                            System.out.println("Descricao: " + medicamentoArray.get(i).getDescricao());
                            System.out.println("Valor: R$" + medicamentoArray.get(i).getValorMedicamento());
                            if (medicamentoArray.get(i).isDisponibilidade() == true) {
                                System.out.println("Quantidade: " + medicamentoArray.get(i).getQtd());
                            } else {
                                System.out.println("Medicamento nao disponivel!");
                            }
                        }

                    } else if (opcao2 == 6) {

                        verificador2 = false;

                    } else {
                        System.out.println("\nOpcao invalida!");
                    }

                } while (verificador2 == true);

            } else if (opcao == 2) {

                do {
                    System.out.println("Qual o historico a ser acessado:\n1- Historico de Consultas;\n2- Historico de Banhos e Tosas;\n3- Voltar.");
                    int opcao2 = sc.nextInt();

                    if (opcao2 == 1) {

                        System.out.println("\nHistorico de Consultas:");

                        for (int i = 0; i < consultaArray.size(); i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("Descricao: " + consultaArray.get(i).getDescricao());
                            System.out.println("Animal da Consulta: " + consultaArray.get(i).getAnimalConsulta().getNome());
                            System.out.println("Medico da Consulta: " + consultaArray.get(i).getMedicoConsulta().getNome());
                            System.out.println("Medicamentos Utilizados: " + consultaArray.get(i).getMedicamentoConsulta().toString());
                            System.out.println("Exames da Consulta: " + consultaArray.get(i).getExameConsulta().toString());
                            System.out.println("Vacinas da Consulta: " + consultaArray.get(i).getVacinaConsulta().toString());
                            System.out.println("Valor Consulta: R$" + consultaArray.get(i).getValorConsulta());
                            System.out.println("Data da Consulta: " + consultaArray.get(i).getDataConsulta());
                            System.out.println("Valor Total: R$" + consultaArray.get(i).getValorTotal());
                            System.out.println("Data da Proxima Consulta: " + consultaArray.get(i).getDataProximaConsulta());

                        }
                    } else if (opcao2 == 2) {

                        System.out.println("\nHistorico de Banhos e Tosas:");
                        for (int i = 0; i < banhoArray.size(); i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("Descricao: " + banhoArray.get(i).getDescricao());
                            System.out.println("Animal do Banho e Tosa: " + banhoArray.get(i).getAnimalBanhoTosa().getNome());
                            System.out.println("Data do Banho e Tosa: " + banhoArray.get(i).getData());
                            System.out.println("Valor: R$" + banhoArray.get(i).getValorBanhoTosa());
                        }

                    } else if (opcao2 == 3) {

                        verificador3 = false;

                    } else {
                        System.out.println("\nOpcao invalida!");
                    }
                } while (verificador3 == true);
            } else if (opcao == 3) {

                do {

                    System.out.println("Quais os eventos futuros a serem acessados:\n1- Proximas Consultas;\n2- Proximos Banhos e Tosas;\n3- Voltar.");
                    int opcao2 = sc.nextInt();

                    if (opcao2 == 1) {

                        System.out.println("\nProximas Consultas:");

                        for (int i = 0; i < consultaArray.size(); i++) {
                            if (consultaArray.get(i).getDataProximaConsulta().isAfter(LocalDateTime.now())) {
                                System.out.println("--------------------------------------");
                                System.out.println("Descricao: " + consultaArray.get(i).getDescricao());
                                System.out.println("Animal da Consulta: " + consultaArray.get(i).getAnimalConsulta().getNome());
                                System.out.println("Medico da Ultima Consulta: " + consultaArray.get(i).getMedicoConsulta().getNome());
                                System.out.println("Medicamentos Utilizados: " + consultaArray.get(i).getMedicamentoConsulta().toString());
                                System.out.println("Exames da Consulta: " + consultaArray.get(i).getExameConsulta().toString());
                                System.out.println("Vacinas da Consulta: " + consultaArray.get(i).getVacinaConsulta().toString());
                                System.out.println("Data da Ultima Consulta: " + consultaArray.get(i).getDataConsulta());
                                System.out.println("Data da Proxima Consulta: " + consultaArray.get(i).getDataProximaConsulta());
                            }
                        }

                    } else if (opcao2 == 2) {

                        for (int i = 0; i < banhoArray.size(); i++) {
                            if (banhoArray.get(i).getData().isAfter(LocalDateTime.now())) {
                                System.out.println("--------------------------------------");
                                System.out.println("Descricao: " + banhoArray.get(i).getDescricao());
                                System.out.println("Animal do Banho e Tosa: " + banhoArray.get(i).getAnimalBanhoTosa().getNome());
                                System.out.println("Data do Banho e Tosa: " + banhoArray.get(i).getData());
                                System.out.println("Valor: R$" + banhoArray.get(i).getValorBanhoTosa());
                            }
                        }

                    } else if (opcao2 == 3) {
                        verificador4 = false;
                    } else {
                        System.out.println("\nOpcao invalida!");
                    }
                } while (verificador4 == true);
            } else if (opcao == 4) {

                verificador = false;

            } else {
                System.out.println("\nOpcao invalida!");
            }

        } while (verificador == true);

    }
}
