package dotty.tools.nio

enum PlatformFileVisitResult {
  case CONTINUE, SKIP_SIBLINGS, SKIP_SUBTREE, TERMINATE
}
