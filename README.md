# basketball-stats
Demo system for log and aggregation of basketball logs

## Design
The system is designed to log basketball statistics in real time, receiving input either through a Web API or by consuming messages from a Kafka topic. 
All incoming logs are stored in a ClickHouse database, chosen for its high-performance analytics capabilities on large volumes of data. 
To support fast and scalable access to aggregated statistics, the system also exposes a Web API that allows users to query statistics with various intersections - by player and season or by team and season. 
To reduce query latency and improve responsiveness, the system caches frequently accessed aggregation results in Redis. This cache is intelligently managed: when new logs are ingested, any Redis entries that are affected by the updated data are selectively evicted, ensuring the cached results remain consistent with the underlying ClickHouse data while minimizing unnecessary recomputation.

## Assumptions
1. Single log contains data for one player at one game.
1. Input data not contains duplication


