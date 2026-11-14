# storehound demo

A small Flutter app configuration with mistakes that get builds refused by
App Store and Google Play review, checked on every push by
[storehound](https://github.com/saimskywalker/storehound).

The check fails on purpose. Open the latest
[workflow run](https://github.com/saimskywalker/storehound-demo/actions) to
see the annotations and the job summary, or try it on your own project:

```yaml
- uses: saimskywalker/storehound@v0
```
