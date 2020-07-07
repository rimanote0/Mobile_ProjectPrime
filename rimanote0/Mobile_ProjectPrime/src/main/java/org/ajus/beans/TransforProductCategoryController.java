package org.ajus.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.ajus.beans.YAHOOWeatherService;
import org.dede.wsclient.CompositeSalesOrderAndOrderLine2;
import org.dede.wsclient.QueryAndDataInsertToProductPrice;
import org.dede.wsclient.QueryDataAndInsertToBPartner;
import org.dede.wsclient.QueryDataAndInsertToMStrorageOnHand;
import org.dede.wsclient.QueryDataAndInsertToProductCategory;
import org.dede.wsclient.QueryDataAndInsertToProducts2;

@ManagedBean
@ViewScoped
public class TransforProductCategoryController implements Serializable {
	
	private String conditions;
    private String task;
    private String unit;		//default
    private Map<String, String> tasks;
    private List<String> tugas = new ArrayList<String>();
    private YAHOOWeatherService weatherService = new YAHOOWeatherService();
    
    @PostConstruct
    public void init() {
    	tasks = new LinkedHashMap<String, String>();
//    	tasks = new HashMap<String, String>();
    	tasks.put("Transfer Produk Kategori", "tasks");
    	tasks.put("Transfer Produk", "tasks");
    	tasks.put("Transfer Harga Produk", "tasks");
    	tasks.put("Transfer Stok In Hand", "tasks");
    	tasks.put("Transfer Bisnis Partner", "tasks");
    	tasks.put("Transfer Transaksi POS", "tasks");
    	
    	
//    	tugas.add("Transfer Produk Kategori");
//    	tugas.add("Transfer Produk");
//    	tugas.add("Transfer Harga Produk");
    }
    
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Map<String, String> getTasks() {
        return tasks;
    }

    public void retrieveConditions() {
        conditions = weatherService.getConditions(task, unit);
    }
    
    public void runTask() {
//    	task = weatherService.getTask(task, unit);
    	if (tasks.equals("QueryDataAndInsertToProductCategory")) {
    		
    	}else if (tasks.equals("QueryDataAndInsertToProducts2")) {
    		
    	}else if (tasks.equals("QueryAndDataInsertToProductPrice")) {
    		
    	}else if (tasks.equals("QueryDataAndInsertToMStrorageOnHand")) {
    		
    	}else if (tasks.equals("QueryDataAndInsertToBPartner")) {
    		
    	}else if (tasks.equals("CompositeSalesOrderAndOrderLine2")) {
    		
    	}
    }
    
    
    public void saveSettings() {
        conditions = null;
    }

	public static void main(String[] args) {
		new QueryDataAndInsertToProductCategory();
		new QueryDataAndInsertToProducts2();
		new QueryAndDataInsertToProductPrice();
		new QueryDataAndInsertToMStrorageOnHand();
		new QueryDataAndInsertToBPartner();
		new CompositeSalesOrderAndOrderLine2();
	}

	public void setTasks(Map<String, String> tasks) {
		this.tasks = tasks;
	}

	public TransforProductCategoryController() {
		tasks = new LinkedHashMap<String, String>();
//    	tasks = new HashMap<String, String>();
    	tasks.put("Transfer Produk Kategori", "TUXX0014");
    	tasks.put("Transfer Produk", "SPXX0015");
    	tasks.put("Transfer Harga Produk", "UKXX0085");
    	tasks.put("Transfer Stok In Hand", "USNY0996");
    	tasks.put("Transfer Bisnis Partner", "FRXX2071");
    	tasks.put("Transfer Transaksi POS", "ITXX0067");	
		
	
    	tugas.add("Transfer Produk Kategori");
    	tugas.add("Transfer Produk");
    	tugas.add("Transfer Harga Produk");
    	
	}

	public List<String> getTugas() {
		return tugas;
	}

	public void setTugas(List<String> tugas) {
		this.tugas = tugas;
	}
	
	

}
