package dotty.tools.io

enum PlatformFileVisitResult {
  case CONTINUE
  case TERMINATE
  case SKIP_SUBTREE
  case SKIP_SIBLINGS
}