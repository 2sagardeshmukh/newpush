package model;

public class Customer {
	
	
		private int custId;
		private String custName;
		private String custType; // regular ,business
		public Customer(int custId, String custName, String custType) {
			super();
			this.custId = custId;
			this.custName = custName;
			this.custType = custType;
		}
		public int getCustId() {
			return custId;
		}
		public String getCustName() {
			return custName;
		}
		public String getCustType() {
			return custType;
		}
		@Override
		public String toString() {
			return "Customer [custId=" + custId + ", custName=" + custName + ", custType=" + custType + "]";
		}
		
		

	}



