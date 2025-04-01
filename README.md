## Check Config

```bash
  docker-compose config
```

## Build Images
```bash
  docker-compose up --build
```

## Stop the containers
```bash
  docker-compose down
```

## Scale Up
```bash
  docker-compose --file docker-compose-scale.yml up -d --build --scale message-server=3 --scale product-server=2
```