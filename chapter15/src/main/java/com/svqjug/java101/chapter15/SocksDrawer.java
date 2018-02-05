package com.svqjug.java101.chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SocksDrawer {

	private Map<String, Socks> pairs;

	public SocksDrawer() {
		pairs = new HashMap<>();
	}

	public int size() {
		return pairs.size();
	}

	public void add(Socks pair) {
		if (pair != null && pair.getDescription() != null && !"".equals(pair.getDescription())) {
			pairs.put(pair.getDescription(), pair);
		}
	}

	public boolean contains(Socks pair) {
		return pairs.containsValue(pair);
	}

	public Optional<Socks> get(String description) {
		if (description != null && !"".equals(description) && pairs.containsKey(description)) {
			return Optional.of(pairs.get(description));
		} else {
			return Optional.empty();
		}
	}

	public Optional<Socks> remove(String description) {
		if (description != null && !"".equals(description) && pairs.containsKey(description)) {
			return Optional.of(pairs.remove(description));
		} else {
			return Optional.empty();
		}
	}

}
