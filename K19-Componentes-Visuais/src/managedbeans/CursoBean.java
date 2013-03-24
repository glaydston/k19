package managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CursoBean {
	private List<String> siglaDoCursoEscolhidos;
	private List<String> cursos;

	public List<String> getSiglaDoCursoEscolhidos() {
		return siglaDoCursoEscolhidos;
	}

	public void setSiglaDoCursoEscolhidos(List<String> siglaDoCursoEscolhidos) {
		this.siglaDoCursoEscolhidos = siglaDoCursoEscolhidos;
	}

	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}

}
