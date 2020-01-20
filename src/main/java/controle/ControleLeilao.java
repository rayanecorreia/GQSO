package controle;

import br.edu.ifal.leilao.Cliente;
import br.edu.ifal.leilao.Lance;
import br.edu.ifal.leilao.Leilao;

public class ControleLeilao {
	public boolean validarLance(Lance novoLance, Leilao leilao) {
		boolean validade = false;
		if(novoLance.getValorDoLance()>= leilao.getLanceMinimo()){
			if(leilao.getLances().size()!= 0) {
				Cliente ultimoCliente = leilao.getLances().get(leilao.getLances().size()-1).getCliente();
				if(novoLance.getCliente().equals(ultimoCliente)) {
					validade = false;
				} else {
					validade = false;
				}
			}
			else {
				validade = true;
			}
		}
		return validade;
	}
	
	
}
