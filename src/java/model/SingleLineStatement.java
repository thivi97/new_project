/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author washi
 */
public class SingleLineStatement {
    
    private int lineNumber;
	private String statement;
	private int cs;
	private int Nkt;
	private int Nid;
	private int Nop;
	private int Nnv;
	private int Nsl;
        private int Wid;
	private int Wop;
	private int Wnv;
	private int Wsl;
	private int Wkw;
        private int Nkw;
	private String tokensOnStatmentSize="";
	
	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public int getCs() {
		return cs;
	}

	public void setCs(int cs) {
		this.cs = cs;
	}

	public int getNkt() {
		return Nkt;
	}

	public void setNkt(int nkt) {
		this.Nkt = nkt;
	}

	public int getNid() {
		return Nid;
	}

	public void setNid(int nid) {
		this.Nid = nid;
	}

	public int getNop() {
		return Nop;
	}

	public void setNop(int nop) {
		this.Nop = nop;
	}

	public int getNnv() {
		return Nnv;
	}

	public void setNnv(int nnv) {
		this.Nnv = nnv;
	}

	public int getNsl() {
		return Nsl;
	}

	public void setNsl(int nsl) {
		this.Nsl = nsl;
	}
        
        public int getWid() {
		return Wid;
	}

	public void setWid(int wid) {
		this.Wid = wid;
	}

	public int getWop() {
		return Wop;
	}

	public void setWop(int wop) {
		this.Wop = wop;
	}

	public int getWnv() {
		return Wnv;
	}

	public void setWnv(int wnv) {
		this.Wnv = wnv;
	}

	public int getWkw() {
		return Wkw;
	}

	public void setWkw(int wkw) {
		this.Wkw = wkw;
	}
        
        public int getWsl() {
		return Wsl;
	}

	public void setWsl(int wsl) {
		this.Wsl = wsl;
	}
        
        public int getNkw() {
		return Nkw;
	}

	public void setNkw(int nkw) {
		this.Nkw = nkw;
	}
        public void calculateCs() {
		this.cs = (this.Wkw * this.Nkw )+(this.Wid * this.Nid) + (this.Wop * this.Nop) + (this.Wnv * this.Nnv) + (this.Wsl * this.Nsl);
	}


	@Override
	public String toString() {
		return "ControlStructureType [statement=" + statement + ", cs=" + cs + ", Nkt=" + Nkt + ", Nid="
				+ Nid + ", Nop=" + Nop + ", Nnv=" + Nnv + ", Nsl=" + Nsl + ", Wid=" + Wid + ", Nkw=" + Nkw + ", Wkw=" + Wkw + ", Wsl=" + Wsl + ", Wnv=" + Wnv + ", Wop=" + Wop + "]";
	}
  
	public String getTokensOnStatmentSize() {
		return tokensOnStatmentSize;
	}

	public void setTokensOnStatmentSize(String tokensOnStatmentSize) {
		this.tokensOnStatmentSize =this.tokensOnStatmentSize+" | " + tokensOnStatmentSize;
	}
    
}
