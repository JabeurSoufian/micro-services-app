package com.clientui.clientui.proxies;

import com.clientui.clientui.beans.ProductBean;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-produits", dismiss404 = true)
@LoadBalancerClient(name = "microservice-produits")
public interface MicroserviceProduitsProxy {
    @GetMapping(value = "/Produits")
    List<ProductBean> listeDesProduits();

    @GetMapping(value = "/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);

}
