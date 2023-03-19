## kubernetes-the-functional-way

### Goals: 
- Use strong static typing to represent the Kubernetes API 
  - Try generating the schema via the OpenAPI spec 
    - https://github.com/eikek/sbt-openapi-schema
- Use the `fs2` api to bind implementations to a Kubernetes Client which implements the Kubernetes API
  - Similar to 
    - 

### Inspirations: 
- `kubernetes-the-hard-wau`
  - https://github.com/kelseyhightower/kubernetes-the-hard-way
- `skuber`
  - https://github.com/doriordan/skuber
- `fs2`
  - https://github.com/typelevel/fs2

### Notes: 
- The only way to learn something thoroughly is to put in the work and to interact with it often🏋️