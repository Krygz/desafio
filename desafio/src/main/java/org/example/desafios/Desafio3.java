package org.example.desafios;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class Desafio3 {
  public static void main(String[] args) {
      try {
          String data = """
                <root>
                    <row>
                        <dia>1</dia>
                        <valor>31490.7866</valor>
                    </row>
                    <row>
                        <dia>2</dia>
                        <valor>37277.9400</valor>
                    </row>
                    <row>
                        <dia>3</dia>
                        <valor>37708.4303</valor>
                    </row>
                    <row>
                        <dia>4</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>5</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>6</dia>
                        <valor>17934.2269</valor>
                    </row>
                    <row>
                        <dia>7</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>8</dia>
                        <valor>6965.1262</valor>
                    </row>
                    <row>
                        <dia>9</dia>
                        <valor>24390.9374</valor>
                    </row>
                    <row>
                        <dia>10</dia>
                        <valor>14279.6481</valor>
                    </row>
                    <row>
                        <dia>11</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>12</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>13</dia>
                        <valor>39807.6622</valor>
                    </row>
                    <row>
                        <dia>14</dia>
                        <valor>27261.6304</valor>
                    </row>
                    <row>
                        <dia>15</dia>
                        <valor>39775.6434</valor>
                    </row>
                    <row>
                        <dia>16</dia>
                        <valor>29797.6232</valor>
                    </row>
                    <row>
                        <dia>17</dia>
                        <valor>17216.5017</valor>
                    </row>
                    <row>
                        <dia>18</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>19</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>20</dia>
                        <valor>12974.2000</valor>
                    </row>
                    <row>
                        <dia>21</dia>
                        <valor>28490.9861</valor>
                    </row>
                    <row>
                        <dia>22</dia>
                        <valor>8748.0937</valor>
                    </row>
                    <row>
                        <dia>23</dia>
                        <valor>8889.0023</valor>
                    </row>
                    <row>
                        <dia>24</dia>
                        <valor>17767.5583</valor>
                    </row>
                    <row>
                        <dia>25</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>26</dia>
                        <valor>0.0000</valor>
                    </row>
                    <row>
                        <dia>27</dia>
                        <valor>3071.3283</valor>
                    </row>
                    <row>
                        <dia>28</dia>
                        <valor>48275.2994</valor>
                    </row>
                    <row>
                        <dia>29</dia>
                        <valor>10299.6761</valor>
                    </row>
                    <row>
                        <dia>30</dia>
                        <valor>39874.1073</valor>
                    </row>
                </root>
            """;
          ByteArrayInputStream inputStream = new ByteArrayInputStream(data.getBytes());

          DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
          DocumentBuilder builder = factory.newDocumentBuilder();
          Document documento = builder.parse(inputStream);

          documento.getDocumentElement().normalize();

          NodeList linhas = documento.getElementsByTagName("row");

          double min = Double.MAX_VALUE;
          double max = Double.MIN_VALUE;
          double total = 0.0;
          int contagem = 0;

          for (int i = 0; i < linhas.getLength(); i++) {
              Element linha = (Element) linhas.item(i);
              double valor = Double.parseDouble(linha.getElementsByTagName("valor").item(0).getTextContent());

              if (valor > 0) {
                  if (valor < min) {
                      min = valor;
                  }
                  if (valor > max) {
                      max = valor;
                  }
                  total += valor;
                  contagem++;
              }
          }

          double media = total / contagem;

          int diasAcimaMedia = 0;
          for (int i = 0; i < linhas.getLength(); i++) {
              Element linha = (Element) linhas.item(i);
              double valor = Double.parseDouble(linha.getElementsByTagName("valor").item(0).getTextContent());

              if (valor > media) {
                  diasAcimaMedia++;
              }
          }

          System.out.println("Menor valor de faturamento: " + min);
          System.out.println("Maior valor de faturamento: " + max);
          System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);

      } catch (Exception ex) {
          throw new RuntimeException("ocorreu um erro!",ex);
      }
  }
}