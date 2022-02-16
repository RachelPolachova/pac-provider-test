function FindProxyForURL(url, host) {
    if (shExpMatch(url, "*:993/*")){ return 'DIRECT';}if (shExpMatch(url, "*:465/*")){ return 'DIRECT';}if (shExpMatch(url, "*:587/*")){ return 'DIRECT';}
	
	if (isPlainHostName(host) || shExpMatch(host, "*.local") ||
		isInNet(dnsResolve(host), "10.0.0.0", "255.0.0.0") ||
		isInNet(dnsResolve(host), "172.16.0.0",  "255.240.0.0") ||
		isInNet(dnsResolve(host), "192.168.0.0",  "255.255.0.0") ||
		isInNet(dnsResolve(host), "127.0.0.0", "255.255.255.0"))
			return 'DIRECT';
	return 'PROXY h.293f571230404cc9.r.d6d107cc85bb4c55.proxy.wandera.co.uk:3123;DIRECT';
}