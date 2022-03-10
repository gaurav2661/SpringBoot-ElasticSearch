package SpringBootElasticSearch.repository;

import SpringBootElasticSearch.domain.LogData;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogDataRepository extends ElasticsearchRepository<LogData,String > {
    List<LogData> findByHost(String host);

    List<LogData> findByMessageContaining(String message);
}
