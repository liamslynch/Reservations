package de.HomerBond005.Reservations;

import java.util.Comparator;
import java.util.Map;


@SuppressWarnings("rawtypes")
class ValueComparator implements Comparator{
	Map<String, Integer> base;

	public ValueComparator(Map<String, Integer> base){
		this.base = base;
	}

	public int compare(Object a, Object b){
		if(base.get(a) < base.get(b)){
			return 1;
		}else if(base.get(a) == base.get(b)){
			return 0;
		}else{
			return -1;
		}
	}
}