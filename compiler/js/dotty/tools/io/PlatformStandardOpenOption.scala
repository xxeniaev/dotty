package dotty.tools.io

enum PlatformStandardOpenOption extends PlatformOpenOption {
  case READ
  case WRITE
  case APPEND
  case TRUNCATE_EXISTING
  case CREATE
  case CREATE_NEW
  case DELETE_ON_CLOSE
  case SPARSE
  case SYNC
  case DSYNC
}