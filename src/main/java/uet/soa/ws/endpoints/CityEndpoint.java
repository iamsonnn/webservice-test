package uet.soa.ws.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import uet.soa.xsd.City;
import uet.soa.xsd.GetCityRequest;
import uet.soa.xsd.GetCityResponse;

@Endpoint
public class CityEndpoint {
    private static final String NAMESPACE_URI = "http://soa.uet/webservice/cities";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCityRequest")
    @ResponsePayload
    public GetCityResponse getCountry(@RequestPayload GetCityRequest request) {
        GetCityResponse response = new GetCityResponse();
        City city = new City();
        city.setName("Ha Noi");
        response.setCity(city);
        return response;
    }
}
