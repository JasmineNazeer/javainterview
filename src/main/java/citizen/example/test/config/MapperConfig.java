package citizen.example.test.config;

import org.modelmapper.*;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;

    @Configuration
    public class MapperConfig {

        @Bean
        public ModelMapper setModelMapper() {
            ModelMapper mapper = new ModelMapper();
            mapper.getConfiguration()
                    .setFieldMatchingEnabled(true)
                    .setFieldAccessLevel(PRIVATE)
                    .setMatchingStrategy(MatchingStrategies.STRICT)
                    .setPropertyCondition(Conditions.isNotNull());

            return mapper;
        }

}
