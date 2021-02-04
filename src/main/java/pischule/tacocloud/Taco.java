package pischule.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class Taco {

    private String name;
    private List<String> ingredients;
}
